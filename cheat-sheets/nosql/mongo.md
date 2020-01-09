# Delete
db.getCollection('collectionName').deleteMany({
    "businessDate" : ISODate("2019-11-29T00:00:00.000Z")
})

# In
db.getCollection('collectionName').find({
    qty: { $in: [ 5, 15 ] } 
})
