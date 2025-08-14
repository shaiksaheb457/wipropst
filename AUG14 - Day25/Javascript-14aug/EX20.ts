function pair<T, U>(first: T, second: U): [T, U] {
    return [first, second];
}

let numberAndString = pair<number, string>(42, "Hello");
console.log(numberAndString);  

let stringAndBoolean = pair<string, boolean>("TypeScript", true);
console.log(stringAndBoolean); 
