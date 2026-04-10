const URL="https://cat-fact.herokuapp.com/facts";
const getFacts= async()=>{
let response= await fetch(URL);
console.log(response);
let data= await response.json();
console.log(data[0].text);
};