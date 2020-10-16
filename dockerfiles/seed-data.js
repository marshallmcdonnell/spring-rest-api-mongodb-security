db.createCollection("users");
db.users.insert({
  "username": "eurgh",
  "password" : "$2a$09$aTpCfwYCwQn4K4z3AmeKhe9dwLG5Uja0LwtLQG0R7rP/9M6zolikK"
});

db.createCollection("rappers");
db.rappers.insertMany([
    {
        name:"Shuffle-T",   
        role:"Champion"
    },
    {
        name:"Marlo",
        role:"Champion"
    },
    {
        name:"Dialect",
        role:"Contender"
    },
    {
        name:"Zen",
        role:"Contender"
    }
]);
