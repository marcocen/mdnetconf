class device::Server2::mydb{
	class { 'postgresql::globals':
		version => 9.2
	}
	class { 'postgresql::server':
		
	}
	
	include configurations::db::S2FirewallRule2
	include configurations::db::S2PGdb
}
