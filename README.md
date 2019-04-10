# javafx-resto-app
## Assignment scope
We already created a basic template for you which allows you to start your application and open up most of the screens available in the application.

## Goals:
  - Familiarize yourself with the use-case at hand, our next assignment will use the same base
    - Learn to familiarize yourself with someone else's code
      - Create a, some-what, advanced JavaFX application with SubScene navigation and event callbacks
        - Define and use view model classes with property binding in JavaFX
	  - Use and design your own JavaFx Screen (extra)
	    
## Setup
Throughout the application we have defined multiple TODO and FIXME comments, making it easy for you to quickly navigate through the code.
IntellliJ provides a quick and easy navigation window, dedicated to these kinds of comment. You can find this view at the bottom of your editor as shown below or via **View->Tool Windows->TODO**

<img src="https://raw.githubusercontent.com/kaspercools/javafx-resto-app/assignment/src/main/resources/intelij-todo.png" width="600"/>

### javafx-ui
This is where you'll spend most of your time coding. We created a basic framework for you to build upon but left out some important parts.
At first the tasks at hand might look like a lot, but keep in mind that you will be evaluated based on the quality of your work not merely the amount of code you have written.

We did not name all components thus you'll have to name then as you see fit. We think it best if you take a moment to look at all the files and general structure and then think about possible design approaches.
 

### resto-domain
In org.howest.resto.domain you'll find a **very** basic model that is used throughout the application. You might have to change a few things here, but there should not be any ground breaking changes.

### resto-repository
We are using an in-memory database approach that can be found in the org.howest.resto.repo* package. You should not have to change anything here, just have a look around and try to understand what's happening here.
Two thing worth mentioning here, are the following:
- The contents of the **MenuRepositoryImpl** class. You'll see that we do not store multiple entities here and the reason why is basically to minimise complexity. If you want to create a multi-menu setup then you can simply extend from the GenericRepositoryImpl class
- We created a **RepositoryProvider** class that you can use to retrieve you database class instances. You can look in the service layer at the existing use cases to see how you can use this class.
   
### resto-service
This is another part of the application you'll be seeing quite a bit of throughout the assignment.

### Things to keep in mind
> Not all methods need to be implemented!

> Quality is far more important than quantity

### Extra's
When your all done you can start thinking about creating your own dashboard. We haven't given you anything to go on, but you can be creative. Look at the information at hand and design/sytle/create your own dashboard. 
Make sure that this dashboard is loaded immediately after signing in to the application.