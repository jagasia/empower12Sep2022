import axios from "axios";

const URL='http://localhost:8081/customer';
class CustomerService
{
    addCustomer(customer)
    {
        return axios.post(URL, customer);
    }

    updateCustomer(customer)
    {
        return axios.put(URL, customer);
    }

    deleteCustomer(id)
    {
        return axios.delete(URL+"/"+id);
    }

    getAllCustomers()
    {
        return axios.get(URL);
    }

    findCustomerById(id)
    {
        return axios.get(URL+"/"+id);
    }
}

export default new CustomerService();