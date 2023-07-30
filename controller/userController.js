const db = require("../db");

const getUsers = (req, res) => {
    db.query("SELECT * FROM user", (err, result) => {
        if (err) {
            console.log(err);
        } else {
            res.json(result);
        }
    });
};

const getSingleUser = (req, res) => {
    const { user_id } = req.params;
    db.query("SELECT * FROM user WHERE user_id = ?", parseInt(user_id), (err, result) => {
        if (err) {
            console.log(err);
        } else {
            res.json(result[0]);
        }
    });
}

const createUser = (req, res) => {
    const { name_user, email_user, phone_user, password_user } = req.body;
    db.query(
        "INSERT INTO user (name_user, email_user, phone_user, password_user) VALUES (?, ?, ?, ?)",
        [name_user, email_user, phone_user, password_user],
        (err, result) => {
            if (err) {
                console.log(err);
            } else {
                res.json(result);
            }
        }
    );
};

const updateUser = (req, res) => {
    const { user_id } = req.params;
    const { name_user, email_user, phone_user, password_user } = req.body;
    db.query(
        "UPDATE user SET name_user = ?, email_user = ?, phone_user = ?, password_user = ? WHERE user_id = ?",
        [name_user, email_user, phone_user, password_user, user_id],
        (err, result) => {
            if (err) {
                console.log(err);
            } else {
                res.json(result);
            }
        }
    );
};

const deleteSingleUser = (req, res) => {
    const { user_id } = req.params;
    db.query("DELETE FROM user WHERE user_id = ?", user_id, (err, result) => {
        if (err) {
            console.log(err);
        } else {
            res.json(result);
        }
    });
};

const deleteAllUser = (req, res) => {
    db.query("DELETE FROM user", (err, result) => {
        if (err) {
            console.log(err);
        } else {
            res.json(result);
        }
    });
};

module.exports = {
    getUsers,
    createUser,
    getSingleUser,
    updateUser,
    deleteAllUser,
    deleteSingleUser,
};
