console.log("Making a Server");

const moduleName=require('http');
const server = http.createSever(function (request, response) {
    console.log(request);
});
const PORT=101;
server.listen(PORT,()=>{
console.log(`Server running on address https://localhost: ${PORT}`);
});
