sideQuests

App for controll the daily repetitive tasks, helping the user to fight against he's procrastination.
Resume

The app is a simple web system made using the MVC architecture, using Spring framework with Thymeleaf template engine and Postgres to persist data. The app should give the users a way to controll the execution of they daily tasks and keep the controll of it.
Stacks

    Java 21
    Spring Boot 4.0.2
    Thymeleaf latest
    Tailwind css
    Postgres 17
    Maven

User's storys

    The user should be able to create an account
    The user should be able to log-in his account
    The user should be able to add tasks that his execute daily
    The user should be able to mark tasks as concluded
    The user should be able to delete tasks that he didn't execute anymore

Non functional requirements

    The app must restart the status of all tasks at midnight for the daily controll
    The app must use the correct HTTP status code
    The app must have friendly error messages and pages
    The app must have consistent U.I
    The app must have logs regitring all the user actions

Next steps

    Create project code base
    Modeling the database
    Configure Spring dependencies
    Create Github issues and kanban

Roadmap
MVC:

    satisfy all user's story and non functional requirements

Post-MVC:

    Consider adding a more robust authentication
    Consider adding Oauth2 login
    Consider addin email triggers for password recover and remiders
    Condiser adding documentation with swagger
