const express = require("express");

const router = express.Router();

const db = require("../db");
const {
    getPosts,
    createPost,
    updatePost,
    getSinglePost,
    deleteSinglePost,
    deleteAllPost,
    getPostOfUser,
    getPostAllDetails
} = require("../controller/postsController");

router.get("/posts", getPosts);

router.get("/allposts", getPostAllDetails);

router.get("/post/:idPost", getSinglePost);

router.get("/post/user/:user_id", getPostOfUser);

router.post("/post/create", createPost);

router.put("/post/:idPost/update", updatePost);

router.delete("/post/:idPost/delete", deleteSinglePost);

router.delete("/post/delete", deleteAllPost);

module.exports = router;
