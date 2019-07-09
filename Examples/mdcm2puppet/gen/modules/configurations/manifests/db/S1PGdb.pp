class configuration::db::S1PGdb {
	postgresql::server::db { 'S1PGdb',
		dbname => 'developmentDB',
		host => 'localhost',
		port => '5432',
		owner => 'user',
		user => 'user',
		password => 'password',
		
	}
}
