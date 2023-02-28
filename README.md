# facebookloginmock

Steps for stating service:

1) Clone the repo
2) Make sure docker is installed on system
3) Run command docker compose up
4) Service will run on 8089 port

Use below api for accessing user profile details.(I kept it random post call and for now it will be giving constant name in response,
we can add certain conditions as per requirement)

http://localhost:8089/user-profile

curl --location 'http://localhost:8089/user-profile' \
--header 'Content-Type: application/json' \
--data-raw '{
    "email":"xyz@gmail.com"
}'

Response:
{
    "username": "Jesse",
    "email": "xyz@gmail.com",
    "id": 12,
    "mobile": "9000000000",
    "valid": true
}

5) Go to https://github.com/jyotikhatri0124/facebooklogin repo-->in application.properties file mentioned login mock api end point as http://localhost:8089
if you are making changes in port, please update the end point in given project as well.
