class device::Server3::mydb {
	class { '::mysql::server':
		root_password => 'new_password',
		
	}
	include configurations::db::S3MySQLDB
}
