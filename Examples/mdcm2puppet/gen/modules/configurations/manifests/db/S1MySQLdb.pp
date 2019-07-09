class configurations::db::S1MySQLdb {
	mysql::db { 'S1MySQLdb',
		dbname => 'developmentDB',
		host => 'localhost',
		port => '3306',
		user => 'user',
		password => 'password',
		
	}
}
