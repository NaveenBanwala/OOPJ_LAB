// naveenObject ={
//     name : "NAveen BAnwala",
//     address : "Kaithal "
// }
// module.exports=naveenObject;
// const os=require('os');
// console.log(os.freemem())
// console.log(os.hostname())
// console.log(os.homedir())
// console.log(os.release(), os.platform(),os.type())
// const path=require('path')
// console.log(path.basename())
const fs = require('fs');
// const n=fs.fdatasync(fd, callback)
// console.log(n)
fs.readFile('file.txt', 'utf8' ,(err ,data)=>{
    console.log(err,data);
})
fs.writeFile('file.txt',"My name is sachin and naven sweety mehak banawla's" ,()=>{
console.log(2-1)
})
console.log("NAveen Banwala")