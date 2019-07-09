class configurations::db::PCWin2DB {
	mysql::db { 'PCWin2DB',
		dbname => 'Win2DB',
		host => 'localhost',
		user => 'Administrator',
		password => 'password',
		
	}
}
