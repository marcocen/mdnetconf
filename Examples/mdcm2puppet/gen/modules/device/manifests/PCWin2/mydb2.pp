class device::PCWin2::mydb2 {
	class { '::mysql::server':
		package_name => 'Percona-Server-server-57',
		package_ensure => '5.7.11-4.1.el7',
		root_password => 'PutYourOwnPwdHere',
		
	}
	include configurations::db::PCWin2DB
}
