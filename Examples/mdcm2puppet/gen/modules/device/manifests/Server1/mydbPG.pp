class device::Server1::mydbPG{
	class { 'postgresql::globals':
		version => 9.2
	}
	class { 'postgresql::server':
		encoding => 'UTF-8',
		locale => 'en_US.UTF-8',
		
	}
	
	include configurations::db::S1PGdb
}
