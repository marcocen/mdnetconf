class configuration::db::PCUnix2DB {
	postgresql::server::db { 'PCUnix2DB',
		dbname => 'PCUnix2DB',
		host => 'localhost',
		user => 'myuser',
		password => 'mypass',
		
	}
}
