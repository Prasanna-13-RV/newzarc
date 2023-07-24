const db = require("../db");

const getPosts = (req, res) => {
    db.query("SELECT * FROM postNews", (err, result) => {
        if (err) {
            console.log(err);
        } else {
            res.json(result);
        }
    });
};

const getSinglePost = (req, res) => {
    const { idPost } = req.params;
    db.query("SELECT * FROM postNews WHERE idPost = ?", parseInt(idPost), (err, result) => {
        if (err) {
            console.log(err);
        } else {
            res.json(result[0]);
        }
    });
}

const createPost = (req, res) => {
    const { namePost, descriptionPost, imageUrlPost } = req.body;
    db.query(
        "INSERT INTO postNews (namePost, descriptionPost, imageUrlPost, likePost) VALUES (?, ?, ?, ?)",
        [namePost, descriptionPost, imageUrlPost, 0],
        (err, result) => {
            if (err) {
                console.log(err);
            } else {
                res.json(result);
            }
        }
    );
};

const updatePost = (req, res) => {
    const { idPost } = req.params;
    const { namePost, descriptionPost, imageUrlPost } = req.body;
    db.query(
        "UPDATE postNews SET namePost = ?, descriptionPost = ?, imageUrlPost = ? WHERE idPost = ?",
        [namePost, descriptionPost, imageUrlPost, idPost],
        (err, result) => {
            if (err) {
                console.log(err);
            } else {
                res.json(result);
            }
        }
    );
};

const deleteSinglePost = (req, res) => {
    const { idPost } = req.params;
    db.query("DELETE FROM postNews WHERE idPost = ?", idPost, (err, result) => {
        if (err) {
            console.log(err);
        } else {
            res.json(result);
        }
    });
};

const deleteAllPost = (req, res) => {
    db.query("DELETE FROM postNews", (err, result) => {
        if (err) {
            console.log(err);
        } else {
            res.json(result);
        }
    });
};

module.exports = {
    getPosts,
    createPost,
    getSinglePost,
    updatePost,
    deleteAllPost,
    deleteSinglePost,
};
