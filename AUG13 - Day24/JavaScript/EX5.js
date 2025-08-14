
var globalVar = "I am var (global)";
let globalLet = "I am let (global)";
const globalConst = "I am const (global)";

console.log(globalVar);   
console.log(globalLet);   
console.log(globalConst); 

function testScope() {
    if (true) {
        var functionScoped = "I am var inside function/block";
        let blockScoped = "I am let inside block";
        const blockConst = "I am const inside block";

        console.log(functionScoped); 
        console.log(blockScoped);    
        console.log(blockConst);     
    }

    console.log(functionScoped); 
}

testScope();

var globalVar = "var can be re-declared";
globalLet = "let can be re-assigned but not re-declared";

console.log(globalVar);
console.log(globalLet);
console.log(globalConst);
