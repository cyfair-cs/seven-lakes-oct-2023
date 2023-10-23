import java.util.*;
import java.io.*;

/*
 * Author: Mufaro Machaya
 */

public class StroudSeas {
	/*
	 * Edit this to switch between file file input
	 * and Standard Input
	 *
	 * Keep it on FALSE for testing (File Input)
	 * Keep it TRUE for the final submission (Standard Input)
	 */
	private static final boolean SUBMIT = false;

	/*
	 * All input files are located at 'dataset/'
	 */
	private static String INPUT_FILE = "dataset/Navigating the Stroudonian Seas.txt";

	private static void input(final Scanner in) {
		/*
		 * Input
		 */
		final int test_cases = in.nextInt();
		for (int test_case = 0; test_case < test_cases; ++test_case) {
			final int
				// Ports are nodes
				num_ports = in.nextInt(),

				// Routes are edges
				num_routes = in.nextInt(),

				// Initial positions
				init_castillo_pos = in.nextInt(),
				init_angus_pos = in.nextInt();

			/*
			 * The relationship between ports/routes to each other
			 * is a graph, so we can store it in a treemap holding
			 * a set or list.
			 */
			Map<Integer, Set<Integer>> graph = new TreeMap<Integer, Set<Integer>>(); 
			for (int route = 0; route < num_routes; ++route) {
				final int from = in.nextInt(),
					to = in.nextInt();
				/*
				 * We have to add to both sides twice to
				 * ensure that the relationship is 
				 * bidirectional.
				 */
				if (!graph.containsKey(from))
					graph.put(from, new TreeSet<Integer>());
				if (!graph.containsKey(to))
					graph.put(to, new TreeSet<Integer>());
				graph.get(from).add(to);
				graph.get(to).add(from);
			}

			/*
			 * Then we call our initial recursion/permutation
			 * function.
			 */
			solve(init_castillo_pos, init_angus_pos, graph, new ArrayList<Integer>());

			/*
			 * Then we print based on whether we found a solution.
			 */
			System.out.println(solution_found ? "We meet at last." : "Lost at sea.");

			/*
			 * solution_found is a static and global variable, so 
			 * we have to reset it manually after every test case.
			 */
			solution_found = false;
		}
	}

	private static boolean solution_found = false;

	/*
	 * Essentially, the root of our solution is implementing a complete search algorithm
	 * that searches every possible situation by permuting every possible order of options
	 * that can be made in every situation at every point. 
	 *
	 * We stop if:
	 *
	 *  - We hit a solution (castillo and angus can reach the same place at the same time)
	 *  - We run out of options (we've visited every node)
	 */
	private static void solve(int castillo_pos, int angus_pos, final Map<Integer, Set<Integer>> graph, List<Integer> visited) 
	{
		if (solution_found)
			return;

		// Optional guard, most likely unnecessary (but no change to runtime).
		if (graph.get(castillo_pos).isEmpty() || graph.get(angus_pos).isEmpty())
			return;

		/*
		 * For each ship, we loop through each of their
		 * possible options at each step.
		 */
		for (Integer castillo_adjcent: graph.get(castillo_pos)) {

			// We cannot hit this place if we've already visited it.
			if (visited.contains(castillo_adjcent))
				continue;

			for (Integer angus_adjacent: graph.get(angus_pos)) {

				// If they are the same place, we have found our solution.
				if (castillo_adjcent == angus_adjacent) {
					solution_found = true;
					return;
				}

				// We cannot hit this place if we've already visited it.
				if (visited.contains(angus_adjacent))
					continue;

				/* 
				 * This is the heart of our permutation. We mark each place
				 * as visited and then set the position for each ship to that
				 * place.
				 *
				 * Due to pass-by-reference, we have to make a new copy of the
				 * 'visited' list to keep a specific version of it for each
				 * iteration/instance of the permutation step.
				 */
				List<Integer> visited_copy = new ArrayList<>(visited);
				visited_copy.add(castillo_adjcent);
				visited_copy.add(angus_adjacent);
				solve(castillo_adjcent, angus_adjacent, graph, visited_copy);
			}
		}
	}

 	/*
 	 * Do not edit this method!
 	 */
	public static void main(String[] args) throws IOException {
		Scanner in = null;
		if (SUBMIT)
			in = new Scanner(System.in);
		else
			in = new Scanner(new File(INPUT_FILE));

		input(in);
	}
}