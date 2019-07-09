class configurations::db::S3MySQLDB {
	mysql::db { 'S3MySQLDB',
		dbname => 'S3_production',
		host => 'localhost',
		user => 'dbuser',
		password => 'password',
		
	}
}
