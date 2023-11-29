package com.assessmet;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CloudVendorServiceImpl implements CloudVendorService
{
	
	CloudVendorRepository cloudVendorRepository;

	public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
		super();
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Updated";
	}

	@Override
	public String deleteCloudVendor(String vendorId) {
		cloudVendorRepository.deleteById(vendorId);
		return "Deleted";
	}

	@Override
	public CloudVendor getCloudVendor(String vendorId) {
		return 	cloudVendorRepository.findById(vendorId).get();
	}

	@Override
	public List<CloudVendor> getAllVendors() {
		return cloudVendorRepository.findAll();
	}

}
