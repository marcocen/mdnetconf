class device::PCUnix2::mydb2{
	class { 'postgresql::globals':
		version => 9.2
	}
	class { 'postgresql::server':
		encoding => 'UTF-8',
		locale => 'en_US.UTF-8',
		
	}
	
	include configurations::db::PCUnix2DB
}
