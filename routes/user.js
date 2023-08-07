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
    getUserByEmail,
    passwordUser
} = require("../controller/userController");

router.get("/users", getUsers);

router.get("/user/:user_id", getSingleUser);

router.get("/user/email/:email", getUserByEmail);

// password
router.post("/user/password/:user_id", passwordUser);

router.post("/user/create", createUser);

router.put("/user/:user_id/update", updateUser);

router.delete("/user/:user_id/delete", deleteSingleUser);

router.delete("/user/delete", deleteAllUser);

module.exports = router;
