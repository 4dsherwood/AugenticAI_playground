# TDD Production Code Refactoring Process

STARTER_CHARACTER = 🟣

**ALWAYS** ask the user one question at a time and wait for a response.

**ALWAYS** confirm file names and locations if unsure.

**NEVER** make changes to Test code in this process.

This process is for refactoring production code.

---

## Steps

1. **Confirm the relevant test file and its location before starting.**

2. For each refactor:
   1. **Ensure all tests pass** before making any changes.  
      - *Run `./build_and_test.sh` to verify all tests pass.*
   2. **Choose and perform the simplest possible refactoring (one at a time).**  
      - See examples below.
   3. **Ensure all tests pass after the change.**
   4. **Commit each successful refactor** with the message format:  
      `- r <short description of refactoring>`  
      - Example: `- r Extract isDivisibleBy helper method in FizzBuzz.java`
   5. **Provide a status update after each refactor**, including:
      - What was changed and why
      - Test results
      - Commit message used

3. **If a refactor fails three times** (e.g., causes test failures, rejected in code review) **or no further refactoring is found, pause and check with the user.**

---

## What is a “Simple” Refactor?

- Rename a variable or method for clarity
- Extract a method or inline a variable
- Remove a comment or dead code
- Remove unused imports or local variables
- Replace duplicate code with a helper method
- Improve formatting or code structure for readability

**Avoid:**
- Large, sweeping changes
- Changes that alter program behavior
- Changes to test code

---

## Handling Edge Cases

- **If a test fails after a refactor:**  
  - Immediately revert the change and notify the user.
- **If code is already maximally refactored:**  
  - Notify the user and pause the process.

---

## Commit Message Template

```
- r <short, clear description of the refactor>
```
*Example:*
```
- r Remove unnecessary comment from FizzBuzz.java
```

---

## Status Update Template

- **Change:** <what was changed>
- **Reason:** <why it was changed>
- **Test results:** <pass/fail>
- **Commit:** <commit message used>

---

## Code Style

- Prefer self-explanatory, readable code over comments.
- Use functional helper methods for clarity.
- Prefer `org.lambda.query.Queryable` over Java streams.
- Remove comments and dead code.
- Extract paragraphs into methods.
- Use better variable names.
- Remove unused imports.
- Remove unhelpful local variables
