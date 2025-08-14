function separateFirstRest(first, ...rest) {
    return { first, rest };
}

console.log(separateFirstRest(1, 2, 3, 4));

console.log(separateFirstRest("a", "b", "c"));
