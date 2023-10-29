# seven-lakes-oct-2023
A repository of all of our solutions to Seven Lakes' October 2023 Meet.

## For Contributors:

Unless you have access to this repository already, submit your solutions as a pull request. Each problem has its own folder, and all solutions to that problem go in its folder. Input files are available in the `dataset` folder, so set scanners to read from that folder and move the Java file to the root directory to run. Additionally, all solutions should be well commented (with the name of the author at the top of the file) such that novice competitors can read through the solutions and fully understand them.

The name of each solution should be the abbreviation of the problem should be abbreviated, with the name of the problem with it's abbreviation and the name of the team captian or author of the program.

For example, with The Pirate Jimmy, one would submit `The Pirate Jimmy/TPJ_Mufaro.java`

For example: `Problem Name/ProblemAbbreviation_Brimey.java`

```java
/*
 * Author: Brimey Higgs
 * Date: 
 */

import java.util.Scanner;
// Other Inputs

class Problem_Brimey {

  /*
   * Some top-level description of your function
   */
  public ArbitraryReturnType solve(ArbitraryInputType input) {
    // What is being done at etc. step
    ArbitraryReturnType some_value = do_something_with_input(input);

    // What is being done/end case
    return some_value;
  }

  /*
   * Some top-level description of your function
   */
  public void main(String[] args) {
    Scanner in = new Scanner(new File("./dataset/arbitraryfileinput.dat"));

    // Some arbitrary input
    ArbitraryInputType input = in.nextArbitraryInputType();

    // Calling our solution function
    ArbitraryReturnType solution = solve(input);

    // Problem finally solved!
    System.out.println(solution);
  }
}
```

Note that your solution absolutely does not need to be that compartmentalized or thoroughly-commented. It just needs to be well-described enough to be understood by someone less experienced.

## Problems Solved

- [X] Coasting on the High Seas
  - Done by All
- [X] The Pirate Jimmy
  - Mufaro Machaya
- [X] Mutiny on the High Seas
  - Amogh Ajoy
  - Mufaro Machaya
  - Timothy Shammas
- [X] Mutiny on the High Seas
  - Amogh Ajoy
  - Timothy Shammas
- [ ] X Marks the Spot
- [X] Hit the Rack!
  - Mufaro Machaya
  - Timothy Shammas
- [X] Message in a Bottle
  - Mufaro Machaya
- [X] We're In For Some Chop!
  - Mufaro Machaya
  - Nam Le
  - Timothy Shammas
- [X] Cannonball Run
  - Amogh Ajoy
  - Timothy Shammas
- [X] Infinite Pirate Theorem
  - Mufaro Machaya
  - Timothy Shammas
- [X] Crew Morale
  - Mufaro Machaya
  - Timothy Shammas
- [X] Polly Wanna Cracker
  - Mufaro Machaya
- [X] Shipbuilding
  - Mufaro Machaya
  - Nam Le
  - Timothy Shammas
- [X] Send for the Armada
  - Amogh Ajoy
- [ ] Quartermaster
- [X] Navigating the Stroudian Seas
  - Mufaro Machaya
- [ ] Why Did I Take German?
- [ ] Rough Seas
- [ ] Hoist the Mizzenmast!