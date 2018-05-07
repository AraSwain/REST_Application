## E-Commerce Application

This is a simple REST application developed with Jersey(JAX-RS). This system is designed to provide only basic functionality via RESTful APIs. This application is developed to show how to develope a RESTful Application. Currently this application supports the following functionalities
**Product**
- Add a *category*
- Update a *category*
- Delete an empty *category*
- Retrieve details of an existing *category*
- Add a *product* (inside a *category*)
- Update *product* details (inside a *category*)
- Delete a *product* (inside a *category*)
- Retrieve details of an existing *product*
**Seller**
- Add a *seller*
- Update  *seller* detils
- Delete an existing  *seller*
- Retrieve details of an existing *seller*

**Resources**
- category
- product
- seller



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


### API Designs
endpoint **http://localhost/mykart/category** 

| Method | Reqyest Payload | Response |
|--------|-------|-----|
| GET |  |  |
| POST |  |  |
| PUT |  |  |
| DELETE |  |  |
