
void WavePrint(int m, int n, int arr[R][C])
{
	// Loop to traverse matrix
	for (int j = 0; j < n; j++) {

		// If the current column
		// is even indexed, print
		// it in forward order
		if (j % 2 == 0) {
			for (int i = 0; i < m; i++) {
				cout << arr[i][j] << " ";
			}
		}

		// If the current column
		// is odd indexed, print
		// it in reverse order
		else {
			for (int i = m - 1; i >= 0; i--) {
				cout << arr[i][j] << " ";
			}
		}
	}
}
