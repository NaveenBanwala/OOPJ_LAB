let boxes=document.querySelectorAll(".box");
let resetbtn=document.querySelector("#resetbtn");
let msgContainer=document.querySelector(".msgContainer");
let msg=document.querySelector("#msg");
let newGameBtn=document.querySelector("#newBtn");
let turnO=true; 
let count =0;
let winPatterns=[
    [0,1,2],
    [0,3,6],[0,4,8],[1,4,7],[2,5,8],[2,4,6],[3,4,5],[6,7,8],
];
const resetGame =() =>{
    turnO=true;
    enableBoxes();
    msgContainer.classList.add("hide");

};
const enableBoxes =()=>{
    for(let box of boxes){
        box.disabled=false;
        box.innerText="";
    }
};
boxes.forEach((box) => {
    box.addEventListener("click",() =>{
        if(turnO){
            box.style.color="red";
            box.innerText='O';
            turnO=false;
            count++;
        }else{
            box.style.color="green";
        box.innerText='X';
        turnO=true;
        count++;
        }
        box.disabled=true;
        checkWinner();
});
});
const checkWinner =()=>{
    for(let pattern of winPatterns){
            let pos1=boxes[pattern[0]].innerText;
            let pos2=boxes[pattern[1]].innerText;
            let pos3=boxes[pattern[2]].innerText;
            if(pos1!="" && pos2!="" && pos3!=""){
                if(pos1===pos3 && pos1===pos2){
                    showWinner(pos3);
                }
            }
    }
};
const showWinner=(winner)=>{
    msg.innerText=`Congrulations Winner is ${winner}`;
    msgContainer.classList.remove("hide");
    disableBoxes();
};
const disableBoxes=()=>{
    for(let box of boxes ){
        box.disabled=true;
    }
};
resetbtn.addEventListener("click",resetGame);
newGameBtn.addEventListener("click",resetGame);