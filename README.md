# smart-allocation-employee-service
The Employee Service will manage all employee-related data


:
________________________________________
🧩 Phase 1: Employee Service — Design Overview
🎯 Purpose
The Employee Service will manage all employee-related data:
•	Basic details (name, email, department)
•	Skill sets
•	Availability status (Free / Busy / On Leave)
•	Assigned projects (if any)
•	Experience, rating, etc.
This service will later communicate with:
•	Project Service (to fetch project details)
•	Allocation Service (to assign employees)
•	Auth Service (for authentication/authorization)
________________________________________
🏗️ Step 1: Create Project Skeleton
Use Spring Initializr:
Dependencies
•	Spring Web
•	Spring Data JPA
•	MySQL Driver (or H2 for dev)
•	Lombok
•	Spring Boot DevTools
•	Validation
Project Metadata
Group: com.smartallocation
Artifact: employee-service
Name: employee-service
Packaging: jar
Java: 17 (or 21)


