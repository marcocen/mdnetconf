class configuration::db::S2PGdb {
	postgresql::server::db { 'S2PGdb',
		dbname => 'server2_production',
		host => 'localhost',
		owner => 'Server2',
		user => 'admin',
		password => 'password',
		
	}
}
