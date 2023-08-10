#Employee Management System

#HOW TO RUN THIS PROJECT?#
###FROM THE IDE:###
1. Open the project in an IDE like Eclipse or sts 4.
2. You can run the DBScript provided in MySQL to create databases and tables with basic values. 
	(Creating a database is necessary since hibernate- update option is used: "spring.jpa.hibernate.ddl-auto = update")
3. If you do not want to run the file, you can change the line "spring.jpa.hibernate.ddl-auto = update"  to  "spring.jpa.hibernate.ddl-auto = create-drop"
	in src/main/resources/application.properties file.
4. Check your database connection in the src/main/resources/application.properties file and change if needed.
5. Go to com.employee.management
6. Right Click on the class Application.
7. Hit "Run As Java Application" in the IDE.
8. Check if the localhost server has started.
9. Open Postman client service on Google Chrome.
10. Hit URL: "http://localhost:8080/home" and URL: "http://localhost:8080/home"
11. Accordingly select the request method and the URL as follows:
	
	Employee: 
		GET - "http://localhost:8080/addEmp" - gets employee added
		GET - "http://localhost:8080/findEmp/{id}" - gets employees with selected id
		PUT - "http://localhost:8080/allEmp" - gets the list of all employees 
		DELETE - "http://localhost:8080/removeEmp/{id}" - deletes employees with selected id



#ASSUMPTIONS#
1. DATABASE and TABLES are created in MySQL

	Eg: {
    "name": "Harekrishna Nayak",
    "age": 23,
    "position": "Java Developer",
    "type": "Permanent",
    "salary": 30000
  }
    

#TECHNOLOGY STACK#
1. Java
2. sts 4
3. MySQL Workbench
4. Postman for Chrome: Version 4.10.5


#DESIGN DISCUSSION#
1. The employee table has a department id foreign key.
2. Department table needs to have a value existing to be referred to by the employee table.
3. Get mapping will fetch the results, Post mapping will insert results, Put mapping and Patch mapping will update results, Delete mapping will delete results.
4. You will need to create the database if not, change the application.properties file.


