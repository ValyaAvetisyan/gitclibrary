# REST API Documentation for Gitc Library
---

## User API
---

### Get all user list

- **URL:** restapi/user
- **Method:**	GET
- **URL Params:** n/a 
- **Data Params:** n/a		 
- **Response Codes:** Success (200), Bad Request (400)


### Add user to database

- **URL**: restapi/user
- **Method**: POST 
- **URL Params**: n/a 
- **Data Params**: ``` {
  "firstName": "<string>",
  "lastName": "<string>",
  "userName": "<string>",
  "password": "<md5 hash, example: 47bce5c74f589f4867dbd57e9ca9f808>",
 "role": { "id": <string>} "SELLER"  or "BUYER"
  "registration_date": <long timestamp, example: 1460362201000> } ```
- **Response Codes:** Success (200), Bad Request (400)

### Edit user to database
- **URL**: restapi/user/edit
- **Method**: POST 
- **URL Params**: n/a 
- **Data Params**: ``` {
  "id": <Long>,
  "firstName": "<string>",
  "lastName": "<string>",
  "userName": "<string>",
  "password": "<md5 hash, example: 47bce5c74f589f4867dbd57e9ca9f808>",
  "role": { "id": <string>},
  "registration_date": <long timestamp, example: 1460362201000> } ```
- **Response Codes:** Success (200), Bad Request (400)


### Get user by user id
- **URL**: restapi/user/{id}
- **Method**: GET 
- **PathVariable**: 
Required: id = [long]
- **URL Params**:
- **Data Params**:
- **Response Codes**: Success (200 OK), Bad Request (400)

### Delete user by  user id
- **URL**: restapi/user/{id}
- **Method**: DELETE
- **PathVariable**:
Required: id = [long];
- **URL Params**:
- **Data Params**: 
- **Response Codes**: Success (200 OK), Bad Request (400)


### Authenticate user by userName and password 
- **URL**:  restapi/user/authenticate
- **Method**: GET
- **PathVariable**: 
- **URL Params**:
Required: userName = [String],
Required: password = [String]
- **Data Params**: 
- **Response Codes**: Success (200 OK), Bad Request (400)

---

## File API
---

### Title:  Get  file list by  user id.
- **URL**: restapi/file/filebyuserid
- **Method**: GET 
- **PathVariable**: 
- **URL Params**:
Required: userId=[long]
- **Data Params**: 
- **Response Codes**: Success (200 OK), Bad Request (400)

### Title:  Get recent upload file list.
- **URL**: restapi/file/recentuploads
- **Method**: GET 
- **PathVariable**: 
- **URL Params**:
- **Data Params**: 
- **Response Codes**: Success (200 OK), Bad Request (400)

### Title:  Get  file list by  category
- **URL**: restapi/file/category
- **Method**: GET 
- **PathVariable**: 
- **URL Params**:  Required: categoryId=[integer]
- **Data Params**:
- **Response Codes**: Success (200 OK), Bad Request (400)

### Title:  delete file by id
- **URL**: restapi/file/delete/{id}
- **Method**: DELETE
- **PathVariable**: 
Required: id = [Long];
- **URL Params**:
- **Data Params**: 
- **Response Codes**: Success (200 OK), Bad Request (400)
