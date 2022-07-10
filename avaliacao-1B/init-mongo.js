db.createUser({
    user: "db-series",
    pdw: "TstPwd@31xx",
    roles: [
        {
            role: "readWrite",
            bd: "db-series"
        }
    ]
})