# seven-lakes-oct-2023
A repository of all of our solutions to Seven Lakes' October 2023 Meet.

## For Contributors:

Unless you have access to this repository already, submit your solutions as a pull request. All solutions will be located in the root folder (`/`), and should be created to read input from `/dataset/`. Additionally, all solutions should be well commented (with the name of the author at the top of the file) such that novice competitors can read through the solutions and fully understand them.

For example:

```java
/*
 * Author: Brimey Higgs
 * Date: 
 */

import java.util.Scanner;
// Other Inputs

class Solution {

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
  - Amogh Ajoy
- [X] The Pirate Jimmy
  - Mufaro Machaya
  - `PirateJimmy.java`
- [X] Mutiny on the High Seas
  - Amogh Ajoy
  - 'mutiny.java'
- [ ] X Marks the Spot
- [X] Hit the Rack!
  - Mufaro Machaya
  - `HitTheRack.java`
- [X] Message in a Bottle
  - Mufaro Machaya
  - `Message.java`
- [X] We're In For Some Chop!
  - Mufaro Machaya
  - `Chop.java`
- [X] Cannonball Run
  - Amogh Ajoy
  - 'cannon.java'
- [X] Infinite Pirate Theorem
  - Mufaro Machaya
  - `PirateTheorem.java`
- [X] Crew Morale
  - Mufaro Machaya
  - `CrewMorale.java`
- [X] Polly Wanna Cracker
  - Mufaro Machaya
  - `Polly.java`
- [X] Shipbuilding
  - Mufaro Machaya
  - `ShipBuilding.java`
- [X] Send for the Armada
  - Amogh Ajoy
  - 'armada.java'
- [ ] Quartermaster
- [X] Navigating the Stroudian Seas
  - Mufaro Machaya
  - `StroudSeas.java`
- [ ] Why Did I Take German?
- [ ] Rough Seas
- [ ] Hoist the Mizzenmast!
