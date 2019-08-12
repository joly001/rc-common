db.rc.cordon.ensureIndex({"geometry" : "2dsphere"})
db.rc.cable.ensureIndex({"geometry" : "2dsphere"})
db.rc.cablePolygon.ensureIndex({"geometry" : "2dsphere"})
db.rc.safetyZone.ensureIndex({"geometry" : "2dsphere"})

./mongoimport -h localhost:28118 -d rc -c rc.cable ./test.json

./mongoimport -h localhost:28118 -d rc -c rc.cordon ./test.json