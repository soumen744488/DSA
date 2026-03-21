# DSA

This repository contains Java implementations of core data structures and algorithms exercises, focused on linked list operations under `src/main/java/LinkedList` and companion test targets under `src/test/java`.

## Project Structure

- `src/main/java/LinkedList`:
  - `Append`, `Prepend`, `Insert`, `Remove`, `Reverse`, `KthNodefromEnd`, `HasLoop`, `FindMiddleNode`, `ReverseBetween`, `PartitionList`, `RemovingDuplicates`, `SwapNodesinPairs`, etc.
  - Each problem has `Main.java`, solution class, and helper files.
- `src/test/java`: unit tests (if present, not currently committed fully in this snapshot).
- `pom.xml`: Maven build configuration.

## How to run

1. Build the project:
   - `mvn clean compile`
2. Run a specific module (example `Append`):
   - `mvn -pl . -Dtest=LinkedList.Append.Main test` (or run the class directly with an IDE).
3. Run all tests:
   - `mvn test`

## Adding new problems

1. Create a new folder under `src/main/java/LinkedList/<ProblemName>`.
2. Add `Main.java` and solution class with package-matching path.
3. Add or update tests under `src/test/java`.
4. Run `mvn test` to verify.

## Notes

- Problem code is organized by operation and uses simple list nodes in Java.
- Keep naming consistent and follow existing conventions.

