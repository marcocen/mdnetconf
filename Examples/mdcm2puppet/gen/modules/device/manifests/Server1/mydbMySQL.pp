class device::Server1::mydbMySQL {
	class { '::mysql::server':
		package_name => 'Percona-Server-server-57',
		
	}
	include configurations::db::S1MySQLdb
}
