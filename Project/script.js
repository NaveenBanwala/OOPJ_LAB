// let div=document.querySelector("div");
// div.style.color="red";
// div.style.height="100px";
// div.style.width="100px";
// div.style.backgroundColor="purple";
// let b=document.querySelector("button");
// b.onclick =() =>{
//     b.style.backgroundColor="pink";
// }
// b.addEventListener("click" , (event) =>{
//     console.log("Hello , Dear where are you from..");
//     console.log(event.type);
//     console.log(event.target);
// });
let mode=document.querySelector("#changeMode");
let currMode="dark";
mode.addEventListener("click" , ()=>{
    if(currMode=="dark"){
        currMode="light";
        document.querySelector("body").style.backgroundColor="white";
    }else{
        currMode="dark";
        document.querySelector("body").style.backgroundColor="black";
    }
    console.log(currMode);
});
