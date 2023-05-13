Feature: Role Creation

Scenario Outline: Verify Role Creation With Multiple Sets of Data

Given Tester Should on RHP

When Tester Enters Admin Login Details

Then Tester Click on role button

When Tester Click on New Role button and enters "<RoleName>" and "<RoleType>"

Then Tester Close Application

Examples:

             | RoleName | RoleType |
             | AsstManagerbnks | E |
             | GenManagerbnks | E |
             | Managerbnks | E |