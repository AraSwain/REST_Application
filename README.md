# REST Application Development
Here we will develop two REST based application 

- **Basic REST App (Employee Management System)**
This app is developed with JAX-RS with Jersy with the basic concepts of RESTful app development like
* Implemented REST methods for CRUD Operation.
* Cosuming XML as payload (Accept: application/xml)
* Produces XML output

- **Advanced REST App (MyKart : an e-commerce app)**
* Followed HAETOUS property of REST Architecture
* Followed Idempotency
* Accepts JSON and produces JSON data
* Object Conversion with Jackson APIs
* Supported PATCH method along with GET, POST, PUT, DELETE
* Authentication
* Custom Media types
* Custom Error Codes


# MyKart (E-Commerce Application)

This is a simple REST application developed with Jersey(JAX-RS). This system is designed to provide only basic functionality via RESTful APIs. This application is developed to show how to develope a RESTful Application. Currently this application supports the following functionalities

## API Design
### Resources and Supported Operations

**Category**
- Add a *category*
- Update a *category*
- Delete an empty *category*
- Retrieve details of an existing *category*

**Product**
- Add a *product* (inside a *category*)
- Update *product* details (inside a *category*)
- Delete a *product* (inside a *category*)
- Retrieve details of an existing *product*

**Seller**
- Add a *seller*
- Update  *seller* detils
- Delete an existing  *seller*
- Retrieve details of an existing *seller*


### Database Design

**CATEGORY** 

| id | catname | description | active | 
|----|---------|-------------|--------|


**PRODUCT**

| id | pname | sku | description | categoryid | mrp | discount | colour |
|----|-------|-----|-------------|------------|-----|----------|--------|


**SELLER**

| id | sname | company | contactname | address | phone | fax | email |
|----|-------|---------|-------------|---------|-------|-----|-------|


### Sample REST Requests

endpoint **http://localhost/mykart/category** 

| Method | Request Payload | Response |
|--------|-------|-----|
| GET |  |  |
| POST |  |  |
| PUT |  |  |
| DELETE |  |  |


endpoint **category** 

| Method | endpoint | Request Payload | Response |
|--------|----------|-----------------|----------|
| GET |  |  |  |
| POST |  |  |  |
| PUT |  |  |  |
| DELETE |  |  |  |


endpoint **product** 

| Method | endpoint | Request Payload | Response |
|--------|----------|-----------------|----------|
| GET |  |  |  |
| POST |  |  |  |
| PUT |  |  |  |
| DELETE |  |  |  |

endpoint **seller** 

| Method | endpoint | Request Payload | Response |
|--------|----------|-----------------|----------|
| GET |  |  |  |
| POST |  |  |  |
| PUT |  |  |  |
| DELETE |  |  |  |

