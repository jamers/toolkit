# MongoDB

## Useful links
* [Tutorials Point tutorial](https://www.tutorialspoint.com/mongodb/index.htm)

### Intro
switch to (create if necessary) database myDb


```javascript
use myDb -- switch to (create if necessary) database 'myDb'
db       -- print current database
show dbs -- list databases (will not show empty databases)
```

### Basics
```bash
db.movie.insert({"name":"terminator"}) -- insert/create movie and add new document with one field "name" value "terminator"
# default database is "test"

db.dropDatabase()

db.createCollection(name, options) # name = name of collection, options = <optional> document of options
/** options allowed:
    capped:boolean fixed size that automatically overwrites oldest entries (default false)
    autoIndexId:boolean whether to auto create index on _id (default false)
    size:number max size in bytes
    max: number max # documents
*/
# collections are created automatically on insert of a document

db.collectionName.drop() -- drop collection with name collectionName

show collections -- list all collections
```
### Data Types
* String
* Integer
* Boolean
* Double
* Min/Max keys
* Arrays
* Timestamp
* Object
* Null
* Symbol
* Date
* Object ID
* Binary data
* code
* Regular Expression

### Insert
```
db.collectionName.insert(document)
--e.g.
db.myCollection.insert({
  _id: ObjectId(7df78ad8902c) -- auto generated if omitted, always 12 byte hexadecimal number
  title: 'My Document'
  tags: ['tag1', 'tag2']
})

-- _id: ObjectId(4 bytes timestamp, 3 bytes machine id, 2 bytes process id, 3 bytes incrementer)

--insert method can take an array to insert multiple documents at once
db.myCollection.insert([{name: 'One'}, {name: 'Two'}])

-- Can also use save instead of insert to overwrite data. If save is passed with id that doesn't exist, it does an insert instead
```
### Find
```
db.myCollection.find() -- find all documents in an unstructured fashion
db.myCollection.find().pretty() -- prettyPrint json
```
### RDBMS Where Equivalents
```
Equality
{<key>:<value>}
db.mycol.find({"by":"tutorials point"}).pretty()
where by = 'tutorials point'

Less Than
{<key>:{$lt:<value>}}
db.mycol.find({"likes":{$lt:50}}).pretty()
where likes < 50

Less Than Equals
{<key>:{$lte:<value>}}
db.mycol.find({"likes":{$lte:50}}).pretty()
where likes <= 50

Greater Than
{<key>:{$gt:<value>}}
db.mycol.find({"likes":{$gt:50}}).pretty()
where likes > 50

Greater Than Equals
{<key>:{$gte:<value>}}
db.mycol.find({"likes":{$gte:50}}).pretty()
where likes >= 50

Not Equals
{<key>:{$ne:<value>}}
db.mycol.find({"likes":{$ne:50}}).pretty()
where likes != 50
```
### AND
```
db.mycol.find(
   {
      $and: [
         {key1: value1}, {key2:value2}
      ]
   }
).pretty()
```
### OR
```
db.mycol.find(
   {
      $or: [
         {key1: value1}, {key2:value2}
      ]
   }
).pretty()
```

### Update
```
-- Update modifies existing document, save persists new one
db.myCollection.update(selectionCriteria, updatedData)
db.myCollection.update({'title':'My Title'}, {$set:{'title':'New Title'}})

-- By default only updates one document.
-- Can update multiple by passing "multi" argument
db.myCollection.update( {'title':'My Title'}, {$set:{'title':'New Title'}}, {multi:true} )
```
### Save
```
-- Save replaces existing document
db.myCollection.save({_id:ObjectId(5983548781331adf45ec7), "title":"Completely new document"})
```
### Remove
```
db.myCollection.remove(DELETION_CRITERIA)

-- takes optional justOne arg boolean, to remove justOne document
db.myCollection.remove(DELETION_CRITERIA, 1)
db.myCollection.remove(DELETION_CRITERIA, true)

--If no search criteria then drop/truncate whole collection
db.myCollection.remove()
```
### Projection
```
-- Selecting only data that is necessary. Set required fields as 1, and unwanted as 0
db.myCollection.find()
{  "_id"  :  ObjectId(5983548781331adf45ec5),  "title":"MongoDB Overview"}  
{  "_id"  :  ObjectId(5983548781331adf45ec6),  "title":"NoSQL Overview"}

db.myCollection.find({}, {"title":1, _id:0}) -- Show title, but not ID
{"title":"MongoDB Overview"}  
{"title":"NoSQL Overview"}
--_id is always shown with find, unless you set it to 0
```
### Limit
```
-- Limit the number of documents returned, accepts one number argument
myDb.myCollection.find().limit(10)

-- Can also specify skip number (defaults to 0)
myDb.myCollection.find().limit(10).skip(10)
```
### Sort
```
-- Accepts a document with a list of fields to sort on. 1 = ascending, -1 = descending. Defaults ascending
db.myCollection.find({}, {"title":1, _id:0}).sort({"title":-1})
--To list titles in reverse alphabetical order
```
### Indices/Indexing
```
db.myCollection.ensureIndex({"title":1}) -- Create an index on title, 1=ascending order
db.myCollection.ensureIndex({"title":1, "description":-1})
-- Also accepts lots of other arguments, not discussed here.
```


### Aggregation

```
db.myCollection.aggregate(AGGREGATE_OPERATION)
db.myCollection.aggregate([{$group : {_id : "$title", num : {$sum : 1}}}])
```

#### List of aggregation expressions
```
$sum
Sums up the defined value from all documents in the collection.
db.mycol.aggregate([{$group : {_id : "$by_user", num_tutorial : {$sum : "$likes"}}}])

$avg
Calculates the average of all given values from all documents in the collection.
db.mycol.aggregate([{$group : {_id : "$by_user", num_tutorial : {$avg : "$likes"}}}])

$min
Gets the minimum of the corresponding values from all documents in the collection.
db.mycol.aggregate([{$group : {_id : "$by_user", num_tutorial : {$min : "$likes"}}}])

$max
Gets the maximum of the corresponding values from all documents in the collection.
db.mycol.aggregate([{$group : {_id : "$by_user", num_tutorial : {$max : "$likes"}}}])

$push
Inserts the value to an array in the resulting document.
db.mycol.aggregate([{$group : {_id : "$by_user", url : {$push: "$url"}}}])

$addToSet
Inserts the value to an array in the resulting document but does not create duplicates.
db.mycol.aggregate([{$group : {_id : "$by_user", url : {$addToSet : "$url"}}}])

$first
Gets the first document from the source documents according to the grouping. Typically this makes only sense together with some previously applied “$sort”-stage.
db.mycol.aggregate([{$group : {_id : "$by_user", first_url : {$first : "$url"}}}])

$last
Gets the last document from the source documents according to the grouping. Typically this makes only sense together with some previously applied “$sort”-stage.
db.mycol.aggregate([{$group : {_id : "$by_user", last_url : {$last : "$url"}}}])
```

### Replication
### Sharding
### Create Backup
### Deployment
