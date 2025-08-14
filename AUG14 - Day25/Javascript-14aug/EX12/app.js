import User from './user.js';

const user1 = new User("John Doe");
document.body.innerHTML = `<h1>${user1.getName()}</h1>`;
