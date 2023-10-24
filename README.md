# seven-lakes-oct-2023
A repository of all of our solutions to Seven Lakes' October 2023 Meet.

## For Contributors:

Unless you have access to this repository already, submit your solutions as a pull request. Each problem has its own folder, and all solutions to that problem go in its folder. Input files are available in the `dataset` folder, so set scanners to read from that folder and move the Java file to the root directory to run. Additionally, all solutions should be well commented (with the name of the author at the top of the file) such that novice competitors can read through the solutions and fully understand them.

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

- [ ] Coasting on the High Seas
- [X] The Pirate Jimmy
  - Mufaro Machaya: `PirateJimmy.java`
  - Tim: `pirateJimmy.java`
- [X] Mutiny on the High Seas
  - Tim: `highSeas.java`
- [ ] X Marks the Spot
- [X] Hit the Rack!
  - Mufaro Machaya: `HitTheRack.java`
  - Tim: sleep.java
- [X] Message in a Bottle
  - Mufaro Machaya: `Message.java`
- [X] We're In For Some Chop!
  - Mufaro Machaya: `Chop.java`
  - Tim: `chop.java`
- [X] Cannonball Run
  - Tim: `cannon.java`
- [X] Infinite Pirate Theorem
  - Mufaro Machaya: `PirateTheorem.java`
  - Tim: `infiniteTheorem.java`
- [X] Crew Morale
  - Mufaro Machaya: `CrewMorale.java`
  - Tim: `morale.java`
- [X] Polly Wanna Cracker
  - Mufaro Machaya: `Polly.java`
- [X] Shipbuilding
  - Mufaro Machaya: `ShipBuilding.java`
  - Tim: `ship.java`
- [ ] Send for the Armada
- [ ] Quartermaster
- [X] Navigating the Stroudian Seas
  - Mufaro Machaya: `StroudSeas.java`
- [ ] Why Did I Take German?
- [ ] Rough Seas
- [ ] Hoist the Mizzenmast!