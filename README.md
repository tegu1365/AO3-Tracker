# AO3-Tracker

## General Information
The idea is based on a table that I use to track fanfics. I need to manually copy and paste the information when adding a new one and use my email to see if there’s an update. In the requirements, it is said that the Fanfic page auto-updates, the idea is to not send too many requests to the ao3 page at one time. The user opens the page and then we update the information about the fic. We don’t want to update the library or the whole table of fanfics because in doing so we could DDoS the site.

## Business Requirements
Our app allows to:

- Login and Register User (NOT using authorization and JWT)
- Users can add fanfics using ao3 link
- Users can view fanfic info
- The Fanfic page auto-updates the info for the fic based on the ao3 link
- Users can track what chapter they were on and when via Library
- Users can use plan tags for their fanfic
- Users can create Collections with description and name;
- Users can add Fanfic to Collections and view them(still in work on front end)

## Git flow

At the moment the latest version is on fe-components branch because we are working on connecting front and back-end.
Many of the branches are for different parts of the project mostly to allow some parallel dev but are more leanier due to organization work.

## Architecture
The project is standart layers architecture for Rest with SpringBoot with two main parts: Back-end and Front-end;

### 1. Back-end 
- 'controller' for backend end-point;
- 'dto' for data transver objects 
- 'mapper' for mapping dto to/from models
- 'sevices' for the business logic 
- 'repository' for communication with database
- 'model' represents the database entities

### 2. Front-end
It's made with Angular and has Components, Models and Services.

## Database
The database schema:
![alt text](/AO3_Tracker.png)

## Endpoints
[Postman Collection](/AO3-Tracker.postman_collection.json)

## Software Technologies
List of all software technologies used during the development process:
- Java 21
- Spring Boot
- Hibernate
- DB integration( PostgreSQL)
- JSoup
- Git
- Angular 18 
- Postman
- Flyway

## ⚙️ Setup

1. Clone this repo
2. Open the back-end project in IDE (Intellij Idea) 
-it may need changes on passwords for PostgresSQL and the database name
3. Press the 'run button'
4. Open the front-end project in IDE:
### if with VS Code:
     5. Run 'npm install' command in terminal
     6. Run 'ng serve'
### if with WebStorm:
     5. Press the 'run button'

Last step: Navigate to http://localhost:4200/

