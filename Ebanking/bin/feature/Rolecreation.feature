Feature: Role Creation Functionality

Scenario Outline: Verify Role Creation With Multiple sets of Data

Given Tester Should On Ranford HP

When Tester Enter Un and Password click on login

Then Tester click on Role button

When Tester click on New Role and enters "<RoleName>" and "<RoleType>"

When Teste Close The Application

Examples:

              | RoleName | RoleType |  
              | PoidbiBnk | E |
              | ClerkIdbiBnk | E |
              | Telleridbi | E |