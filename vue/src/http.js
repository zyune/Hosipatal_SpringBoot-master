/**
 * http配置
 */

import axios from 'axios'
import router from './router'

// axios 配置
axios.defaults.timeout = 5000
axios.defaults.baseURL = 'http://localhost:6066'

export default axios
