class Box<T> {
    value: T;

    constructor(value: T) {
        this.value = value;
    }

    getValue(): T {
        return this.value;
    }
}

let stringBox = new Box<string>("Hello World");
console.log(stringBox.getValue());

let numberBox = new Box<number>(12345);
console.log(numberBox.getValue());

let booleanBox = new Box<boolean>(true);
console.log(booleanBox.getValue());
