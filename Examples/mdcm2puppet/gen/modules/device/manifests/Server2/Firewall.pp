class device::Server2::Firewall {
	class { 'firewall':
		
	}
	
	include configurations::firewall::S2FirewallRule1
}
