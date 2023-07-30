const express = require("express");

const router = express.Router();

const db = require("../db");

const {
    getUsers,
    createUser,
    getSingleUser,
    updateUser,
    deleteAllUser,
    deleteSingleUser,
} = require("../controller/userController");

router.get("/users", getUsers);

router.get("/user/:user_id", getSingleUser);

router.post("/user/create", createUser);

router.put("/user/:user_id/update", updateUser);

router.delete("/user/:user_id/delete", deleteSingleUser);

router.delete("/user/delete", deleteAllUser);

module.exports = router;
