const express = require("express");
const app = express();
const cors = require("cors")
const morgan = require("morgan")

const posts = require("./routes/post");
const db = require("./db");

app.use(morgan())
app.use(cors())
app.use(express.json());

app.use("/api", posts);

app.get("/", (req, res) => {
    res.send("Hello World");
});

app.listen(8080, () => {
    console.log(`Server is running on 8080`);
});
